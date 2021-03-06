from .implicit_type import ImplicitTypeHandler

class FSharpHandler(ImplicitTypeHandler):

    def header(self):
        return "# F#"

    def booleanRepr(self, bool_val):
        if bool_val:
            return "true"
        return "false"

    def numberRepr(self, number_string):
        return number_string

    def stringRepr(self, string_without_quotes):
        return "\"" + string_without_quotes + "\""

    def createFullOutputString(self, variable_name, value):
        return "let " + variable_name + " = " + value

    def arrayStartString(self):
        return "[|"

    def arrayEndString(self):
        return "|]"

    def setStartString(self):
        return "Set.ofList ["

    def setEndString(self):
        return "]"

    def mapStartString(self):
        return "["

    def mapEndString(self):
        return "]|> Map.ofList"

    def keyValueStartString(self):
        return ""

    def keyValueEndString(self):
        return ""

    def multiValueSeparator(self):
        return "; "

    def keyValueSeparator(self):
        return ", "

