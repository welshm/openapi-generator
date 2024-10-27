from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ModelEnum(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    V_1 = 'V_1'
    V_1_TURBO = 'V_1_TURBO'
    V_2 = 'V_2'
    V_2_TURBO = 'V_2_TURBO'
    def __init__(self):  # noqa: E501
        """ModelEnum - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ModelEnum':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ModelEnum of this ModelEnum.  # noqa: E501
        :rtype: ModelEnum
        """
        return util.deserialize_model(dikt, cls)
