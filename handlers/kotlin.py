from .implicit_type import ImplicitTypeHandler

class KotlinHandler(ImplicitTypeHandler):

    def header(self):
        return "# Kotlin"

    def booleanRepr(self, bool_val):
        if bool_val:
            return "true"
        return "false"


    def numberRepr(self, number_string):
        return number_string

    def stringRepr(self, string_without_quotes):
        return "\"" + string_without_quotes + "\""

    def createFullOutputString(self, variable_name, value):
        return "val " + variable_name + " = " + value

    def arrayStartString(self):
        return "arrayOf("

    def arrayEndString(self):
        return ")"

    def setStartString(self):
        return "setOf("

    def setEndString(self):
        return ")"

    def mapStartString(self):
        return "mapOf("

    def mapEndString(self):
        return ")"

    def keyValueStartString(self):
        return ""

    def keyValueEndString(self):
        return ""

    def multiValueSeparator(self):
        return ","

    def keyValueSeparator(self):
        return " to "

