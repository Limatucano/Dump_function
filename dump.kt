fun Any.dump(){
    when(this){
        is String -> println("STRING $this")
        is Array<*> -> println("ARRAY: $this")
        is Double -> println("DOUBLE: $this")
        is Int -> println("INT: $this")
        is Boolean -> println("BOOLEAN: $this")
        is List<*> -> println("LIST: $this")
        is MutableList<*> -> println("MUTABLE LIST: $this")
        is Map<*,*> -> println("MAP: $this")
        is Float -> println("FLOAT: $this")
        is IntArray -> println("INTARRAY: $this")
        is FloatArray -> println("FLOATARRAY: $this")
        is Byte -> println("BYTE: $this")
        is Short -> println("SHORT: $this")
        is Long -> println("LONG: $this")
        is Char -> println("CHAR: $this")
        else -> println("500 - NOT FOUND THE TYPE")
    }
}

