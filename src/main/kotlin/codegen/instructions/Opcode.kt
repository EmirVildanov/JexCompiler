package codegen.instructions

enum class Opcode {
    Constant, // 0
    Null, // 1
    True, // 2
    False, // 3
    Pop, // 4
    GetLocal, // 5
    SetLocal, // 6
    GetGlobal, // 7
    DefineGlobal, // 8
    SetGlobal, // 9
    Print, // 10
    Not, // 11
    Equal, // 12
    Greater, // 13
    Less, // 14
    Negate, // 15
    Add, // 16
    Subtract, // 17
    Multiply, // 18
    Divide, // 19
    JumpForward, // 20
    JumpForwardIfFalse, // 21
    JumpBackward, // 22
    Call, // 23
    Return, // 24
    ToString, // 25
    ReadLine, // 26
    ParseInt; // 27

    fun compile(): Byte = ordinal.toByte()
}