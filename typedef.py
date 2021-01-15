#!/bin/python
import sys
from antlr4 import *
from generated_antlr.typedef_dslLexer import typedef_dslLexer
from generated_antlr.typedef_dslParser import typedef_dslParser
from listener import TopLevelListener
from handlers import ScalaHandler, ClojureHandler, FSharpHandler, HaskellHandler, JavaScriptHandler, LuaHandler, PHPHandler, RubyHandler, PythonHandler, CPPHandler, KotlinHandler, SwiftHandler

def main(argv):
    rawStream = FileStream(argv[1])
    lexer = typedef_dslLexer(rawStream)
    stream = CommonTokenStream(lexer)
    parser = typedef_dslParser(stream)
    tree = parser.statements()

    handlers = []
    handlers.append(ScalaHandler())
    handlers.append(ClojureHandler())
    handlers.append(FSharpHandler())
    handlers.append(HaskellHandler())
    handlers.append(JavaScriptHandler())
    handlers.append(LuaHandler())
    handlers.append(PHPHandler())
    handlers.append(RubyHandler())
    handlers.append(PythonHandler())
    handlers.append(CPPHandler())
    handlers.append(KotlinHandler())
    handlers.append(SwiftHandler())

    l = TopLevelListener(handlers)
    walker = ParseTreeWalker()
    walker.walk(l, tree)

    for handler in handlers:
        handler.printOutputs()
        print("")

if __name__ == "__main__":
    main(sys.argv)
