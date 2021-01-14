from .implicit_type import ImplicitTypeHandler

class RubyHandler(ImplicitTypeHandler):

    def __init__(self):
        super().__init__()
        self.requireSetImport = False

    def header(self):
        header = "# Ruby"

        if self.requireSetImport:
            header += "\nrequire 'set'\n"

        return header

    def booleanRepr(self, bool_val):
        if bool_val:
            return "true"
        return "false"

    def numberRepr(self, number_string):
        return number_string

    def stringRepr(self, string_without_quotes):
        return "\"" + string_without_quotes + "\""

    def createFullOutputString(self, variable_name, value):
        return variable_name + " = " + value

    def arrayStartString(self):
        return "["

    def arrayEndString(self):
        return "]"

    def setStartString(self):
        self.requireSetImport = True
        return "Set["

    def setEndString(self):
        return "]"

    def mapStartString(self):
        return "{"

    def mapEndString(self):
        return "}"

    def keyValueStartString(self):
        return ""

    def keyValueEndString(self):
        return ""

    def multiValueSeparator(self):
        return ","

    def keyValueSeparator(self):
        return " => "

