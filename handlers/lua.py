from .implicit_type import ImplicitTypeHandler

class LuaHandler(ImplicitTypeHandler):

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
        return "{"

    def arrayEndString(self):
        return "}"

    def setStartString(self):
        print("Lua does not support sets - deferring to array")
        return "{"

    def setEndString(self):
        return "}"

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
        return " = "

    # Lua maps are strange and require wrapping of keys in [] - so implementing custom KeyValue handler
    def endKeyValue(self):
        kv = self.value_stack.pop()
        self.value_stack[-1] += self.keyValueStartString() + "[" + kv[0][0] + "]" + self.keyValueSeparator() + kv[1][0] + self.keyValueEndString() + self.multiValueSeparator()
