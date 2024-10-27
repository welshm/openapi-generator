from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.enum_with_common_prefix import EnumWithCommonPrefix
from openapi_server.models.test_enum import TestEnum
from openapi_server.models.test_enum_with_default import TestEnumWithDefault
from openapi_server import util

from openapi_server.models.enum_with_common_prefix import EnumWithCommonPrefix  # noqa: E501
from openapi_server.models.test_enum import TestEnum  # noqa: E501
from openapi_server.models.test_enum_with_default import TestEnumWithDefault  # noqa: E501

class TestModel(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, test_enum_common_prefix=EnumWithCommonPrefix.V_T_2, test_enum=None, test_string=None, test_enum_with_default=TestEnumWithDefault.ZWEI, test_string_with_default='ahoy matey', test_inline_defined_enum_with_default='B'):  # noqa: E501
        """TestModel - a model defined in OpenAPI

        :param test_enum_common_prefix: The test_enum_common_prefix of this TestModel.  # noqa: E501
        :type test_enum_common_prefix: EnumWithCommonPrefix
        :param test_enum: The test_enum of this TestModel.  # noqa: E501
        :type test_enum: TestEnum
        :param test_string: The test_string of this TestModel.  # noqa: E501
        :type test_string: str
        :param test_enum_with_default: The test_enum_with_default of this TestModel.  # noqa: E501
        :type test_enum_with_default: TestEnumWithDefault
        :param test_string_with_default: The test_string_with_default of this TestModel.  # noqa: E501
        :type test_string_with_default: str
        :param test_inline_defined_enum_with_default: The test_inline_defined_enum_with_default of this TestModel.  # noqa: E501
        :type test_inline_defined_enum_with_default: str
        """
        self.openapi_types = {
            'test_enum_common_prefix': EnumWithCommonPrefix,
            'test_enum': TestEnum,
            'test_string': str,
            'test_enum_with_default': TestEnumWithDefault,
            'test_string_with_default': str,
            'test_inline_defined_enum_with_default': str
        }

        self.attribute_map = {
            'test_enum_common_prefix': 'test_enum_common_prefix',
            'test_enum': 'test_enum',
            'test_string': 'test_string',
            'test_enum_with_default': 'test_enum_with_default',
            'test_string_with_default': 'test_string_with_default',
            'test_inline_defined_enum_with_default': 'test_inline_defined_enum_with_default'
        }

        self._test_enum_common_prefix = test_enum_common_prefix
        self._test_enum = test_enum
        self._test_string = test_string
        self._test_enum_with_default = test_enum_with_default
        self._test_string_with_default = test_string_with_default
        self._test_inline_defined_enum_with_default = test_inline_defined_enum_with_default

    @classmethod
    def from_dict(cls, dikt) -> 'TestModel':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TestModel of this TestModel.  # noqa: E501
        :rtype: TestModel
        """
        return util.deserialize_model(dikt, cls)

    @property
    def test_enum_common_prefix(self) -> EnumWithCommonPrefix:
        """Gets the test_enum_common_prefix of this TestModel.


        :return: The test_enum_common_prefix of this TestModel.
        :rtype: EnumWithCommonPrefix
        """
        return self._test_enum_common_prefix

    @test_enum_common_prefix.setter
    def test_enum_common_prefix(self, test_enum_common_prefix: EnumWithCommonPrefix):
        """Sets the test_enum_common_prefix of this TestModel.


        :param test_enum_common_prefix: The test_enum_common_prefix of this TestModel.
        :type test_enum_common_prefix: EnumWithCommonPrefix
        """

        self._test_enum_common_prefix = test_enum_common_prefix

    @property
    def test_enum(self) -> TestEnum:
        """Gets the test_enum of this TestModel.


        :return: The test_enum of this TestModel.
        :rtype: TestEnum
        """
        return self._test_enum

    @test_enum.setter
    def test_enum(self, test_enum: TestEnum):
        """Sets the test_enum of this TestModel.


        :param test_enum: The test_enum of this TestModel.
        :type test_enum: TestEnum
        """
        if test_enum is None:
            raise ValueError("Invalid value for `test_enum`, must not be `None`")  # noqa: E501

        self._test_enum = test_enum

    @property
    def test_string(self) -> str:
        """Gets the test_string of this TestModel.


        :return: The test_string of this TestModel.
        :rtype: str
        """
        return self._test_string

    @test_string.setter
    def test_string(self, test_string: str):
        """Sets the test_string of this TestModel.


        :param test_string: The test_string of this TestModel.
        :type test_string: str
        """

        self._test_string = test_string

    @property
    def test_enum_with_default(self) -> TestEnumWithDefault:
        """Gets the test_enum_with_default of this TestModel.


        :return: The test_enum_with_default of this TestModel.
        :rtype: TestEnumWithDefault
        """
        return self._test_enum_with_default

    @test_enum_with_default.setter
    def test_enum_with_default(self, test_enum_with_default: TestEnumWithDefault):
        """Sets the test_enum_with_default of this TestModel.


        :param test_enum_with_default: The test_enum_with_default of this TestModel.
        :type test_enum_with_default: TestEnumWithDefault
        """

        self._test_enum_with_default = test_enum_with_default

    @property
    def test_string_with_default(self) -> str:
        """Gets the test_string_with_default of this TestModel.


        :return: The test_string_with_default of this TestModel.
        :rtype: str
        """
        return self._test_string_with_default

    @test_string_with_default.setter
    def test_string_with_default(self, test_string_with_default: str):
        """Sets the test_string_with_default of this TestModel.


        :param test_string_with_default: The test_string_with_default of this TestModel.
        :type test_string_with_default: str
        """

        self._test_string_with_default = test_string_with_default

    @property
    def test_inline_defined_enum_with_default(self) -> str:
        """Gets the test_inline_defined_enum_with_default of this TestModel.


        :return: The test_inline_defined_enum_with_default of this TestModel.
        :rtype: str
        """
        return self._test_inline_defined_enum_with_default

    @test_inline_defined_enum_with_default.setter
    def test_inline_defined_enum_with_default(self, test_inline_defined_enum_with_default: str):
        """Sets the test_inline_defined_enum_with_default of this TestModel.


        :param test_inline_defined_enum_with_default: The test_inline_defined_enum_with_default of this TestModel.
        :type test_inline_defined_enum_with_default: str
        """
        allowed_values = ["A", "B", "C"]  # noqa: E501
        if test_inline_defined_enum_with_default not in allowed_values:
            raise ValueError(
                "Invalid value for `test_inline_defined_enum_with_default` ({0}), must be one of {1}"
                .format(test_inline_defined_enum_with_default, allowed_values)
            )

        self._test_inline_defined_enum_with_default = test_inline_defined_enum_with_default
