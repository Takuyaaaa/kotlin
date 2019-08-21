/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.wasm.internal

@WasmImport("runtime", "String_getLiteral")
internal fun stringLiteral(index: Int): String =
    implementedAsIntrinsic


internal fun throwWithMessageStub(s: String): Nothing {
    wasm_unreachable()
}