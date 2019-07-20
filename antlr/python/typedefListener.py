import sys
from antlr4 import *
from typedef_dslParser import typedef_dslParser
from typedef_dslListener import typedef_dslListener

class TypedefListener(typedef_dslListener):
    def __init__(self, output):
        self.output = output
        self.output.write("TEST\n")

    def enterStatements(self, ctx:typedef_dslParser.StatementsContext):
        self.output.write("ENTERING\n")

    def exitStatements(self, ctx:typedef_dslParser.StatementsContext):
        self.output.write(ctx.getText() + "\n")
