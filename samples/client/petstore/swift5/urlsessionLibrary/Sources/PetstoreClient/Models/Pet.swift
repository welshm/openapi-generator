//
// Pet.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

@available(*, deprecated, renamed: "PetstoreClientAPI.Pet")
public typealias Pet = PetstoreClientAPI.Pet

extension PetstoreClientAPI {

public final class Pet: Codable, Hashable {

    public enum Status: String, Codable, CaseIterable {
        case available = "available"
        case pending = "pending"
        case sold = "sold"
    }
    public var id: Int64?
    public var category: Category?
    public var name: String
    public var photoUrls: [String]
    public var tags: [Tag]?
    /** pet status in the store */
    public var status: Status?

    public init(id: Int64? = nil, category: Category? = nil, name: String, photoUrls: [String], tags: [Tag]? = nil, status: Status? = nil) {
        self.id = id
        self.category = category
        self.name = name
        self.photoUrls = photoUrls
        self.tags = tags
        self.status = status
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case category
        case name
        case photoUrls
        case tags
        case status
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(category, forKey: .category)
        try container.encode(name, forKey: .name)
        try container.encode(photoUrls, forKey: .photoUrls)
        try container.encodeIfPresent(tags, forKey: .tags)
        try container.encodeIfPresent(status, forKey: .status)
    }

    public static func == (lhs: Pet, rhs: Pet) -> Bool {
        lhs.id == rhs.id &&
        lhs.category == rhs.category &&
        lhs.name == rhs.name &&
        lhs.photoUrls == rhs.photoUrls &&
        lhs.tags == rhs.tags &&
        lhs.status == rhs.status
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(id?.hashValue)
        hasher.combine(category?.hashValue)
        hasher.combine(name.hashValue)
        hasher.combine(photoUrls.hashValue)
        hasher.combine(tags?.hashValue)
        hasher.combine(status?.hashValue)
        
    }
}

}
