# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from petstore_api.models.enum_with_common_prefix import EnumWithCommonPrefix
from petstore_api.models.test_enum import TestEnum
from petstore_api.models.test_enum_with_default import TestEnumWithDefault
from typing import Optional, Set
from typing_extensions import Self

class TestModelWithEnumDefault(BaseModel):
    """
    TestModelWithEnumDefault
    """ # noqa: E501
    test_enum_common_prefix: Optional[EnumWithCommonPrefix] = EnumWithCommonPrefix.VAL_2
    test_enum: TestEnum
    test_string: Optional[StrictStr] = None
    test_enum_with_default: Optional[TestEnumWithDefault] = TestEnumWithDefault.ZWEI
    test_string_with_default: Optional[StrictStr] = 'ahoy matey'
    test_inline_defined_enum_with_default: Optional[StrictStr] = 'B'
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = ["test_enum_common_prefix", "test_enum", "test_string", "test_enum_with_default", "test_string_with_default", "test_inline_defined_enum_with_default"]

    @field_validator('test_inline_defined_enum_with_default')
    def test_inline_defined_enum_with_default_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['A', 'B', 'C']):
            raise ValueError("must be one of enum values ('A', 'B', 'C')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of TestModelWithEnumDefault from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * Fields in `self.additional_properties` are added to the output dict.
        """
        excluded_fields: Set[str] = set([
            "additional_properties",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TestModelWithEnumDefault from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "test_enum_common_prefix": obj.get("test_enum_common_prefix") if obj.get("test_enum_common_prefix") is not None else EnumWithCommonPrefix.VAL_2,
            "test_enum": obj.get("test_enum"),
            "test_string": obj.get("test_string"),
            "test_enum_with_default": obj.get("test_enum_with_default") if obj.get("test_enum_with_default") is not None else TestEnumWithDefault.ZWEI,
            "test_string_with_default": obj.get("test_string_with_default") if obj.get("test_string_with_default") is not None else 'ahoy matey',
            "test_inline_defined_enum_with_default": obj.get("test_inline_defined_enum_with_default") if obj.get("test_inline_defined_enum_with_default") is not None else 'B'
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


