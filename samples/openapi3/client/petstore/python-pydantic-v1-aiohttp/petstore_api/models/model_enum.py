# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import json
import pprint
import re  # noqa: F401
from aenum import Enum, no_arg





class ModelEnum(str, Enum):
    """
    ModelEnum
    """

    """
    allowed enum values
    """
    V_1 = 'V_1'
    V_1_TURBO = 'V_1_TURBO'
    V_2 = 'V_2'
    V_2_TURBO = 'V_2_TURBO'

    @classmethod
    def from_json(cls, json_str: str) -> ModelEnum:
        """Create an instance of ModelEnum from a JSON string"""
        return ModelEnum(json.loads(json_str))


