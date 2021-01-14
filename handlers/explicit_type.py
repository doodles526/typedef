class ExplicitTypeHandler:

    def header(self):
        return ""

    def booleanTypeString(self):
        return ""

    def booleanRepr(self, bool_val):
        return ""

    def numberTypeString(self):
        # TODO: Float vs int
        return ""

    def numberRepr(self, number_string):
        return ""

    def stringTypeString(self):
        return ""

    def stringRepr(self, string_without_quotes):
        return ""

    def createFullOutputString(self, type_str, variable_name, value):
        return ""

    def arrayTypeStartString(self):
        return ""

    def arrayTypeEndString(self):
        return ""

    def arrayStartString(self):
        return ""

    def arrayEndString(self):
        return ""

    def setTypeStartString(self):
        return ""

    def setTypeEndString(self):
        return ""

    def setStartString(self):
        return ""

    def setEndString(self):
        return ""

    def mapTypeStartString(self):
        return ""

    def mapTypeEndString(self):
        return ""

    def mapStartString(self):
        return ""

    def mapEndString(self):
        return ""

    def keyValueStartString(self):
        return ""

    def keyValueEndString(self):
        return ""

    def multiValueSeparator(self):
        return ""

    def keyValueSeparator(self):
        return ""

    def __init__(self):
        self.outputs = []
        self.value_stack = [[]]
        self.type_stack = [[]]
        self.current_variable_name = ""
        self.requireSetImport = False
        self.requireMapImport = False
        self.requireArrayImport = False

    def beginNewInputs(self):
        self.outputs = []

    def endNewInputs(self):
        pass

    def printOutputs(self, with_header=True):
        print(self.header())
        # TODO: Print imports
        for output in self.outputs:
            print(output)

    def beginLiteral(self):
        self.value_stack = [[]]
        self.type_stack = [[]]

    def endLiteral(self):
        print(self.type_stack)
        self.outputs.append(self.createFullOutputString(self.type_stack[0][0], self.current_variable_name, self.value_stack[0][0]))

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
    # TODO: Flag stack pushing for multi-value
    def setBooleanValue(self, bool_val):
        self.value_stack[-1].append(self.booleanRepr(bool_val))
        self.type_stack[-1].append(self.booleanTypeString())

    def setNumberValue(self, number_text):
        self.value_stack[-1].append(self.numberRepr(number_text))
        self.type_stack[-1].append(self.numberTypeString()) # TODO: Multiple number types

    def setStringValue(self, string_without_quotes):
        self.value_stack[-1].append(self.stringRepr(string_without_quotes))
        self.type_stack[-1].append(self.stringTypeString()) # TODO: Multiple number types

    
    # recursive #

    def beginArrayValue(self):
        self.value_stack.append(self.arrayStartString())
        self.type_stack.append(self.arrayTypeStartString()) # TODO: Multiple number types

    def endArrayValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents + self.arrayEndString())

        array_type = self.type_stack.pop()
        self.type_stack[-1].append(array_type + self.arrayTypeEndString())

    def beginSetValue(self):
        self.value_stack.append(self.setStartString())
        self.type_stack.append(self.setTypeStartString()) # TODO: Multiple number types

    def endSetValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1].append(contents + self.setEndString())

        set_type = self.type_stack.pop()
        self.type_stack[-1].append(set_type + self.setTypeEndString())

    def beginMapValue(self): 
        self.value_stack.append(self.mapStartString())
        self.value_stack.append([]) # keyValContainer since we don't have the multi-value container helper
        self.type_stack.append(self.mapTypeStartString())
        self.type_stack.append([]) # keyValContainer since we don't have the multi-value container helper

    def endMapValue(self):
        contents = self.value_stack.pop()
        self.value_stack[-1] += self.multiValueSeparator().join(contents) + self.mapEndString()
        final_map = self.value_stack.pop()
        self.value_stack[-1].append(final_map)

        map_type = self.type_stack.pop()
        self.type_stack[-1] += map_type[0] + self.mapTypeEndString()
        final_map_type = self.type_stack.pop()
        self.type_stack[-1].append(final_map_type)


    def beginMultipleValues(self):
        self.value_stack.append([])
        self.type_stack.append([])

    # TODO Determine how not to segment inner arrays for readability
    # Try a stack counter?
    def endMultipleValues(self):
        vals = self.value_stack.pop()

        self.value_stack[-1] += self.multiValueSeparator().join(vals)

        # TODO: Enforce uniform types
        embedded_types = self.type_stack.pop()
        self.type_stack[-1] += embedded_types[0]
        



    def beginKeyValue(self):
        self.value_stack.append([])
        self.type_stack.append([])

    def endKeyValue(self):
        kv = self.value_stack.pop()
        self.value_stack[-1].append(self.keyValueStartString() + kv[0] + self.keyValueSeparator() + kv[1] + self.keyValueEndString())
        
        kv_type = self.type_stack.pop()
        self.type_stack[-1].append(kv_type[0] + "," + kv_type[1])

    # No need to alter these. They are handled by individual values handlers
    def beginKVKey(self):
        pass


    def endKVKey(self):
        pass

    def beginKVValue(self):
        pass

    def endKVValue(self):
        pass
