//
// FileSchemaTestClass.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

@objc public class FileSchemaTestClass: NSObject, Codable {

    public var file: File?
    public var files: [File]?

    public init(file: File? = nil, files: [File]? = nil) {
        self.file = file
        self.files = files
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case file
        case files
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(file, forKey: .file)
        try container.encodeIfPresent(files, forKey: .files)
    }
}

