/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec
        }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

// @ts-ignore
import { ApiResponse } from '../model/apiResponse';
// @ts-ignore
import { Pet } from '../model/pet';

// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


export interface AddPetRequestParams {
    /** Pet object that needs to be added to the store */
    body: Pet;
}

export interface DeletePetRequestParams {
    /** Pet id to delete */
    petId: number;
    apiKey?: string;
}

export interface FindPetsByStatusRequestParams {
    /** Status values that need to be considered for filter */
    status: Array<'available' | 'pending' | 'sold'>;
}

export interface FindPetsByTagsRequestParams {
    /** Tags to filter by */
    tags: Array<string>;
}

export interface GetPetByIdRequestParams {
    /** ID of pet to return */
    petId: number;
}

export interface UpdatePetRequestParams {
    /** Pet object that needs to be added to the store */
    body: Pet;
}

export interface UpdatePetWithFormRequestParams {
    /** ID of pet that needs to be updated */
    petId: number;
    /** Updated name of the pet */
    name?: string;
    /** Updated status of the pet */
    status?: string;
}

export interface UploadFileRequestParams {
    /** ID of pet to update */
    petId: number;
    /** Additional data to pass to server */
    additionalMetadata?: string;
    /** file to upload */
    file?: Blob;
}


@Injectable({
  providedIn: 'root'
})
export class PetService {

    protected basePath = 'http://petstore.swagger.io/v2';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();
    public encoder: HttpParameterCodec;

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (configuration) {
            this.configuration = configuration;
        }
        if (typeof this.configuration.basePath !== 'string') {
            if (typeof basePath !== 'string') {
                basePath = this.basePath;
            }
            this.configuration.basePath = basePath;
        }
        this.encoder = this.configuration.encoder || new CustomHttpParameterCodec();
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }

    private addToHttpParams(httpParams: HttpParams, value: any, key?: string): HttpParams {
        if (typeof value === "object" && value instanceof Date === false) {
            httpParams = this.addToHttpParamsRecursive(httpParams, value);
        } else {
            httpParams = this.addToHttpParamsRecursive(httpParams, value, key);
        }
        return httpParams;
    }

    private addToHttpParamsRecursive(httpParams: HttpParams, value?: any, key?: string): HttpParams {
        if (value == null) {
            return httpParams;
        }

        if (typeof value === "object") {
            if (Array.isArray(value)) {
                (value as any[]).forEach( elem => httpParams = this.addToHttpParamsRecursive(httpParams, elem, key));
            } else if (value instanceof Date) {
                if (key != null) {
                    httpParams = httpParams.append(key,
                        (value as Date).toISOString().substr(0, 10));
                } else {
                   throw Error("key may not be null if value is Date");
                }
            } else {
                Object.keys(value).forEach( k => httpParams = this.addToHttpParamsRecursive(
                    httpParams, value[k], key != null ? `${key}.${k}` : k));
            }
        } else if (key != null) {
            httpParams = httpParams.append(key, value);
        } else {
            throw Error("key may not be null if value is not object or array");
        }
        return httpParams;
    }

    /**
     * Add a new pet to the store
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public addPet(requestParameters: AddPetRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<any>;
    public addPet(requestParameters: AddPetRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpResponse<any>>;
    public addPet(requestParameters: AddPetRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpEvent<any>>;
    public addPet(requestParameters: AddPetRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: undefined,}): Observable<any> {
        const body = requestParameters.body;
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling addPet.');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }



        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json',
            'application/xml'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Content-Type', httpContentTypeSelected);
        }

        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.post<any>(`${this.configuration.basePath}/pet`,
            body,
            {
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Deletes a pet
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deletePet(requestParameters: DeletePetRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<any>;
    public deletePet(requestParameters: DeletePetRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpResponse<any>>;
    public deletePet(requestParameters: DeletePetRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpEvent<any>>;
    public deletePet(requestParameters: DeletePetRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: undefined,}): Observable<any> {
        const petId = requestParameters.petId;
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling deletePet.');
        }
        const apiKey = requestParameters.apiKey;

        let localVarHeaders = this.defaultHeaders;
        if (apiKey !== undefined && apiKey !== null) {
            localVarHeaders = localVarHeaders.set('api_key', String(apiKey));
        }

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }



        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.delete<any>(`${this.configuration.basePath}/pet/${encodeURIComponent(String(petId))}`,
            {
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public findPetsByStatus(requestParameters: FindPetsByStatusRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<Array<Pet>>;
    public findPetsByStatus(requestParameters: FindPetsByStatusRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<HttpResponse<Array<Pet>>>;
    public findPetsByStatus(requestParameters: FindPetsByStatusRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<HttpEvent<Array<Pet>>>;
    public findPetsByStatus(requestParameters: FindPetsByStatusRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<any> {
        const status = requestParameters.status;
        if (status === null || status === undefined) {
            throw new Error('Required parameter status was null or undefined when calling findPetsByStatus.');
        }

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (status) {
            localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
                status.join(COLLECTION_FORMATS['csv']), 'status');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/xml',
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }



        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.get<Array<Pet>>(`${this.configuration.basePath}/pet/findByStatus`,
            {
                params: localVarQueryParameters,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     * @deprecated
     */
    public findPetsByTags(requestParameters: FindPetsByTagsRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<Array<Pet>>;
    public findPetsByTags(requestParameters: FindPetsByTagsRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<HttpResponse<Array<Pet>>>;
    public findPetsByTags(requestParameters: FindPetsByTagsRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<HttpEvent<Array<Pet>>>;
    public findPetsByTags(requestParameters: FindPetsByTagsRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<any> {
        const tags = requestParameters.tags;
        if (tags === null || tags === undefined) {
            throw new Error('Required parameter tags was null or undefined when calling findPetsByTags.');
        }

        let localVarQueryParameters = new HttpParams({encoder: this.encoder});
        if (tags) {
            localVarQueryParameters = this.addToHttpParams(localVarQueryParameters,
                tags.join(COLLECTION_FORMATS['csv']), 'tags');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/xml',
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }



        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.get<Array<Pet>>(`${this.configuration.basePath}/pet/findByTags`,
            {
                params: localVarQueryParameters,
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getPetById(requestParameters: GetPetByIdRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<Pet>;
    public getPetById(requestParameters: GetPetByIdRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<HttpResponse<Pet>>;
    public getPetById(requestParameters: GetPetByIdRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<HttpEvent<Pet>>;
    public getPetById(requestParameters: GetPetByIdRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/xml' | 'application/json',}): Observable<any> {
        const petId = requestParameters.petId;
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling getPetById.');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (api_key) required
        localVarCredential = this.configuration.lookupCredential('api_key');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('api_key', localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/xml',
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }



        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.get<Pet>(`${this.configuration.basePath}/pet/${encodeURIComponent(String(petId))}`,
            {
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Update an existing pet
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updatePet(requestParameters: UpdatePetRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<any>;
    public updatePet(requestParameters: UpdatePetRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpResponse<any>>;
    public updatePet(requestParameters: UpdatePetRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpEvent<any>>;
    public updatePet(requestParameters: UpdatePetRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: undefined,}): Observable<any> {
        const body = requestParameters.body;
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling updatePet.');
        }

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }



        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json',
            'application/xml'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Content-Type', httpContentTypeSelected);
        }

        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.put<any>(`${this.configuration.basePath}/pet`,
            body,
            {
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Updates a pet in the store with form data
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updatePetWithForm(requestParameters: UpdatePetWithFormRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<any>;
    public updatePetWithForm(requestParameters: UpdatePetWithFormRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpResponse<any>>;
    public updatePetWithForm(requestParameters: UpdatePetWithFormRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: undefined,}): Observable<HttpEvent<any>>;
    public updatePetWithForm(requestParameters: UpdatePetWithFormRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: undefined,}): Observable<any> {
        const petId = requestParameters.petId;
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling updatePetWithForm.');
        }
        const name = requestParameters.name;
        const status = requestParameters.status;

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }


        // to determine the Content-Type header
        const consumes: string[] = [
            'application/x-www-form-urlencoded'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let localVarFormParams: { append(param: string, value: any): any; };
        let localVarUseForm = false;
        let localVarConvertFormParamsToString = false;
        if (localVarUseForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new HttpParams({encoder: this.encoder});
        }


        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.post<any>(`${this.configuration.basePath}/pet/${encodeURIComponent(String(petId))}`,
            localVarConvertFormParamsToString ? localVarFormParams.toString() : localVarFormParams,
            {
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * uploads an image
     * @param requestParameters
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public uploadFile(requestParameters: UploadFileRequestParams, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json',}): Observable<ApiResponse>;
    public uploadFile(requestParameters: UploadFileRequestParams, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json',}): Observable<HttpResponse<ApiResponse>>;
    public uploadFile(requestParameters: UploadFileRequestParams, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json',}): Observable<HttpEvent<ApiResponse>>;
    public uploadFile(requestParameters: UploadFileRequestParams, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json',}): Observable<any> {
        const petId = requestParameters.petId;
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling uploadFile.');
        }
        const additionalMetadata = requestParameters.additionalMetadata;
        const file = requestParameters.file;

        let localVarHeaders = this.defaultHeaders;

        let localVarCredential: string | undefined;
        // authentication (petstore_auth) required
        localVarCredential = this.configuration.lookupCredential('petstore_auth');
        if (localVarCredential) {
            localVarHeaders = localVarHeaders.set('Authorization', 'Bearer ' + localVarCredential);
        }

        let localVarHttpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (localVarHttpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            localVarHttpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (localVarHttpHeaderAcceptSelected !== undefined) {
            localVarHeaders = localVarHeaders.set('Accept', localVarHttpHeaderAcceptSelected);
        }


        // to determine the Content-Type header
        const consumes: string[] = [
            'multipart/form-data'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let localVarFormParams: { append(param: string, value: any): any; };
        let localVarUseForm = false;
        let localVarConvertFormParamsToString = false;
        if (localVarUseForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new HttpParams({encoder: this.encoder});
        }


        let responseType_: 'text' | 'json' = 'json';
        if(localVarHttpHeaderAcceptSelected && localVarHttpHeaderAcceptSelected.startsWith('text')) {
            responseType_ = 'text';
        }

        return this.httpClient.post<ApiResponse>(`${this.configuration.basePath}/pet/${encodeURIComponent(String(petId))}/uploadImage`,
            localVarConvertFormParamsToString ? localVarFormParams.toString() : localVarFormParams,
            {
                responseType: <any>responseType_,
                withCredentials: this.configuration.withCredentials,
                headers: localVarHeaders,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
