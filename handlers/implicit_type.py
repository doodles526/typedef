class ImplicitTypeHandler:
    def booleanRepr(self, bool_val):
        pass

    def numberRepr(self, number_string):
        pass

    def stringRepr(self, string_without_quotes):
        pass

    def createFullOutputString(self, variable_name, value):
        pass

    def arrayStartString(self):
        pass

    def arrayEndString(self):
        pass

    def setStartString(self):
        pass

    def setEndString(self):
        pass

    def mapStartString(self):
        pass

    def mapEndString(self):
        pass

    def keyValueStartString(self):
        pass

    def keyValueEndString(self):
        pass

    def multiValueSeparator(self):
        pass

    def keyValueSeparator(self):
        pass


    def __init__(self):
        self.outputs = []
        self.value_stack = [[]]
        self.current_variable_name = ""

    def beginNewInputs(self):
        self.outputs = []

    def endNewInputs(self):
        print(self.outputs)

    def beginLiteral(self):
        self.value_stack = [[]]

    def endLiteral(self):
        self.outputs.append(self.createFullOutputString(self.current_variable_name, self.value_stack[0][0]))

    def setVariableName(self, var_name):
        self.current_variable_name = var_name


    ### Type Declaration Handlers ###

    def beginEmbeddedType(self, type_name):
        pass

    def endEmbeddedType(self):
        pass

    def setLiteralType(self, type_name):
        pass




    ### Literal VALUE HANDLING ###

    def setBooleanValue(self, bool_val):
        self.value_stack[-1].append(self.booleanRepr(bool_val))

    def setNumberValue(self, number_text):
        self.value_stack[-1].append(self.numberRepr(number_text))

    def setStringValue(self, string_without_quotes):
        self.value_stack[-1].append(self.stringRepr(string_without_quotes))

    
    # recursive #

    def beginArrayValue(self):
        self.value_stack.append(self.arrayStartString())

    def endArrayValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents + self.arrayEndString())

    def beginSetValue(self):
        self.value_stack.append(self.setStartString())

    def endSetValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents + self.setEndString())


    def beginMapValue(self): 
        self.value_stack.append(self.mapStartString())

    def endMapValue(self):
        contents = self.value_stack.pop()
        # TODO: trim the ending comma?
        self.value_stack[-1].append(contents[:-1] + self.mapEndString())


    def beginMultipleValues(self):
        self.value_stack.append([])

    # TODO Determine how not to segment inner arrays for readability
    # Try a stack counter?
    def endMultipleValues(self):
        vals = self.value_stack.pop()

        self.value_stack[-1] += self.multiValueSeparator().join(vals)



    def beginKeyValue(self):
        self.value_stack.append([])

    def endKeyValue(self):
        kv = self.value_stack.pop()
        self.value_stack[-1] += self.keyValueStartString() + kv[0][0] + self.keyValueSeparator() + kv[1][0] + self.keyValueEndString() + self.multiValueSeparator()

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
