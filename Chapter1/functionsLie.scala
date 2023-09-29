// A function lies when the signature is not telling the whole story about the body

// This function tells the truth we can pass every int and it will work
def add(a: Int, b: Int): Int = {
    return a + b;
}

// This function lies since we can pass 0 and it will fail
def divide(a: Int, b: Int): Int = {
    return a / b;
}

// This function lies since we could pass an empty string and it will return us an error and not the first char
def getFirstCharacter(s: String): Int = {
    return s.CharAt(0);
}