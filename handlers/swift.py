from .explicit_type import ExplicitTypeHandler

class SwiftHandler(ExplicitTypeHandler):

    def header(self):
        header = "# Swift"

        return header

    def booleanRepr(self, bool_val):
        if bool_val:
            return "true"
        return "false"

    def booleanTypeString(self):
        return "Bool"

    def intTypeString(self):
        return "Int"

    def intRepr(self, number_string):
        return number_string

    def floatTypeString(self):
        return "Float"

    def floatRepr(self, number_string):
        return number_string

    def binaryTypeString(self):
        return "Int"

    def binaryRepr(self, number_string):
        return number_string

    def hexTypeString(self):
        return "Int"

    def hexRepr(self, number_string):
        return number_String

    def stringRepr(self, string_without_quotes):
        return "\"" + string_without_quotes + "\""

    def stringTypeString(self):
        return "String"

    def createFullOutputString(self, type_str, variable_name, value):
        return "let " + variable_name + ": " + type_str + " = " + value + ";"

    def arrayStartString(self):
        return "["

    def arrayEndString(self):
        return "]"

    def arrayTypeStartString(self):
        return "["

    def arrayTypeEndString(self):
        return "]"

    def setStartString(self):
        return "["

    def setEndString(self):
        return "]"

    def setTypeStartString(self):
        return "Set<"

    def setTypeEndString(self):
        return ">"

    def mapStartString(self):
        return "["

    def mapEndString(self):
        return "]"

    def mapTypeStartString(self):
        return "["

    def mapTypeEndString(self):
        return "]"

    def keyValueStartString(self):
        return ""

    def keyValueEndString(self):
        return ""

    def multiValueSeparator(self):
        return ","

    def keyValueSeparator(self):
        return ":"

    def printOutputs(self, with_header=True):
        print(self.header())
        for output in self.outputs:
            print(output)


    def __init__(self):
        super().__init__()
        self.requireSetImport = False
        self.requireMapImport = False

