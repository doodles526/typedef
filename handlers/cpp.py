from .explicit_type import ExplicitTypeHandler

class CPPHandler(ExplicitTypeHandler):

    def header(self):
        header = "# C++"

        body = []
        if self.requireSetImport:
            body.append("#include <unordered_set>")
        if self.requireMapImport:
            body.append("#include <unordered_map>")

        if len(body) > 0:
            body.insert(0, header)
            header = "\n".join(body)
        return header

    def booleanRepr(self, bool_val):
        if bool_val:
            return "true"
        return "false"

    def booleanTypeString(self):
        return "bool"

    def numberRepr(self, number_string):
        return number_string

    def numberTypeString(self):
        return "int"

    def stringRepr(self, string_without_quotes):
        return "\"" + string_without_quotes + "\""

    def stringTypeString(self):
        return "string"

    def createFullOutputString(self, type_str, variable_name, value):
        return type_str + " " + variable_name + " = " + value + ";"

    def arrayStartString(self):
        return "{"

    def arrayEndString(self):
        return "}"

    def arrayTypeStartString(self):
        return "vector<"

    def arrayTypeEndString(self):
        return ">"

    def setStartString(self):
        self.requireSetImport = True
        return "{"

    def setEndString(self):
        return "}"

    def setTypeStartString(self):
        return "unordered_set<"

    def setTypeEndString(self):
        return ">"

    def mapStartString(self):
        self.requireMapImport = True
        return "{"

    def mapEndString(self):
        return "}"

    def mapTypeStartString(self):
        return "unordered_map<"

    def mapTypeEndString(self):
        return ">"

    def keyValueStartString(self):
        return "{"

    def keyValueEndString(self):
        return "}"

    def multiValueSeparator(self):
        return ","

    def keyValueSeparator(self):
        return ","

    def printOutputs(self, with_header=True):
        print(self.header())
        for output in self.outputs:
            print(output)


    def __init__(self):
        super().__init__()
        self.requireSetImport = False
        self.requireMapImport = False

