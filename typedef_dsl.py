#!/bin/python
import sys
from antlr4 import *
from typedef_dslLexer import typedef_dslLexer
from typedef_dslParser import typedef_dslParser
from typedef_dslListener import TopLevelListener
from handlers.python import PythonHandler

def main(argv):
    rawStream = FileStream(argv[1])
    lexer = typedef_dslLexer(rawStream)
    stream = CommonTokenStream(lexer)
    parser = typedef_dslParser(stream)
    tree = parser.statements()


    l = TopLevelListener([PythonHandler()])
    walker = ParseTreeWalker()
    walker.walk(l, tree)


if __name__ == "__main__":
    main(sys.argv)
