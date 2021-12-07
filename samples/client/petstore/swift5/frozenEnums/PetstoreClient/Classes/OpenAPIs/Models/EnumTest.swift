//
// EnumTest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct EnumTest: Codable, Hashable {

    public enum EnumString: String, Codable, CaseIterable, CaseIterableDefaultsLast {
        case upper = "UPPER"
        case lower = "lower"
        case empty = ""
        // This case is a catch-all generated by OpenAPI such that the enum is "non-frozen".
        // If new enum cases are added that are unknown to the spec/client, they are safely
        // decoded to this case. The raw value of this case is a dummy value that attempts
        // to avoids collisions with previously specified cases.
        case unknownDefaultOpenAPI = "unknown_default_open_api"
    }
    public enum EnumStringRequired: String, Codable, CaseIterable, CaseIterableDefaultsLast {
        case upper = "UPPER"
        case lower = "lower"
        case empty = ""
        // This case is a catch-all generated by OpenAPI such that the enum is "non-frozen".
        // If new enum cases are added that are unknown to the spec/client, they are safely
        // decoded to this case. The raw value of this case is a dummy value that attempts
        // to avoids collisions with previously specified cases.
        case unknownDefaultOpenAPI = "unknown_default_open_api"
    }
    public enum EnumInteger: Int, Codable, CaseIterable, CaseIterableDefaultsLast {
        case _1 = 1
        case number1 = -1
        // This case is a catch-all generated by OpenAPI such that the enum is "non-frozen".
        // If new enum cases are added that are unknown to the spec/client, they are safely
        // decoded to this case. The raw value of this case is a dummy value that attempts
        // to avoids collisions with previously specified cases.
        //
        // 192, used to calculate the raw value, was the Swift Evolution proposal for
        // frozen/non-frozen enums.
        // [SE-0192](https://github.com/apple/swift-evolution/blob/master/proposals/0192-non-exhaustive-enums.md)
        //
        case unknownDefaultOpenAPI = -11184809 // Int.min / 192
    }
    public enum EnumNumber: Double, Codable, CaseIterable, CaseIterableDefaultsLast {
        case _11 = 1.1
        case number12 = -1.2
        // This case is a catch-all generated by OpenAPI such that the enum is "non-frozen".
        // If new enum cases are added that are unknown to the spec/client, they are safely
        // decoded to this case. The raw value of this case is a dummy value that attempts
        // to avoids collisions with previously specified cases.
        //
        // 192, used to calculate the raw value, was the Swift Evolution proposal for
        // frozen/non-frozen enums.
        // [SE-0192](https://github.com/apple/swift-evolution/blob/master/proposals/0192-non-exhaustive-enums.md)
        //
        case unknownDefaultOpenAPI = -11184809 // Int.min / 192
    }
    public var enumString: EnumString?
    public var enumStringRequired: EnumStringRequired
    public var enumInteger: EnumInteger?
    public var enumNumber: EnumNumber?
    public var outerEnum: OuterEnum?

    public init(enumString: EnumString? = nil, enumStringRequired: EnumStringRequired, enumInteger: EnumInteger? = nil, enumNumber: EnumNumber? = nil, outerEnum: OuterEnum? = nil) {
        self.enumString = enumString
        self.enumStringRequired = enumStringRequired
        self.enumInteger = enumInteger
        self.enumNumber = enumNumber
        self.outerEnum = outerEnum
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case enumString = "enum_string"
        case enumStringRequired = "enum_string_required"
        case enumInteger = "enum_integer"
        case enumNumber = "enum_number"
        case outerEnum
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(enumString, forKey: .enumString)
        try container.encode(enumStringRequired, forKey: .enumStringRequired)
        try container.encodeIfPresent(enumInteger, forKey: .enumInteger)
        try container.encodeIfPresent(enumNumber, forKey: .enumNumber)
        try container.encodeIfPresent(outerEnum, forKey: .outerEnum)
    }
}

