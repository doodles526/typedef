from .implicit_type import ImplicitTypeHandler

class HaskellHandler(ImplicitTypeHandler):
    def __init__(self):
        super().__init__()
        self.requireSetImport = False
        self.requireMapImport = False

    def header(self):
        header = "# Haskell"

        body = []
        if self.requireSetImport:
            body.append("import Data.Set (Set)")
            body.append("import qualified Data.Set as Set")
        if self.requireMapImport:
            body.append("import Data.Map (Map)")
            body.append("import qualified Data.Map as Map\n")

        if len(body) > 0:
            body.insert(0, header)
            header = "\n".join(body)
        return header

    def booleanRepr(self, bool_val):
        if bool_val:
            return "True"
        return "False"

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
        return "Set.fromList ["

    def setEndString(self):
        return "]"

    def mapStartString(self):
        self.requireMapImport = True
        return "Map.fromList ["

    def mapEndString(self):
        return "]"

    def keyValueStartString(self):
        return "("

    def keyValueEndString(self):
        return ")"

    def multiValueSeparator(self):
        return ","

    def keyValueSeparator(self):
        return " , "

