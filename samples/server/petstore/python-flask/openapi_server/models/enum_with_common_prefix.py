from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EnumWithCommonPrefix(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    V_MORE_1 = 'V_MORE_1'
    V_T_2 = 'V_T_2'
    V_MULT_3 = 'V_MULT_3'
    def __init__(self):  # noqa: E501
        """EnumWithCommonPrefix - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'EnumWithCommonPrefix':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnumWithCommonPrefix of this EnumWithCommonPrefix.  # noqa: E501
        :rtype: EnumWithCommonPrefix
        """
        return util.deserialize_model(dikt, cls)
