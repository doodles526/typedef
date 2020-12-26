class PythonHandler:
    def __init__(self):
        self.outputs = []
        self.current_literal = ""
        self.value_stack = [[]]

    def beginNewInputs(self):
        self.outputs = []

    def endNewInputs(self):
        print(self.outputs[0])
        pass

    def beginLiteral(self):
        self.current_literal = ""
        self.value_stack = [[]]

    def endLiteral(self):
        self.outputs.append(self.current_literal + self.value_stack[0][0])
#        print(self.current_literal)
 #       print(self.value_stack[0][0])

    def setVariableName(self, var_name):
        self.current_literal += var_name + " = "


    ### Type Declaration Handlers ###

    def beginEmbeddedType(self, type_name):
        pass

    def endEmbeddedType(self):
        pass

    def setLiteralType(self, type_name):
        pass




    ### Literal VALUE HANDLING ###

    def setBooleanValue(self, bool_val):
        self.value_stack[-1].append(str(bool_val))

    def setNumberValue(self, number_text):
        self.value_stack[-1].append(number_text)

    def setStringValue(self, string_without_quotes):
        self.value_stack[-1].append("\"" + string_without_quotes + "\"")

    
    # recursive #

    def beginArrayValue(self):
        self.value_stack.append("[")

    def endArrayValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents + "]")

    def beginSetValue(self):
        self.value_stack.append("set(")

    def endSetValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents + ")")


    def beginMapValue(self): 
        self.value_stack.append("{")

    def endMapValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents[:-1] + "}")


    def beginMultipleValues(self):
        self.value_stack.append([])

    # TODO Determine how not to segment inner arrays for readability
    # Try a stack counter?
    def endMultipleValues(self):
        vals = self.value_stack.pop()

        self.value_stack[-1] += ",".join(vals)



    def beginKeyValue(self):
        self.value_stack.append([])

    def endKeyValue(self):
        kv = self.value_stack.pop()
        print(kv[0])
        print(self.value_stack)
        self.value_stack[-1] += kv[0][0] + ": " + kv[1][0] + ","

    def beginKVKey(self):
        self.value_stack.append([])


    def endKVKey(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents)

    def beginKVValue(self):
        self.value_stack.append([])

    def endKVValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents)
