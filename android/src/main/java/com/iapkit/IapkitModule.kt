package com.iapkit

import com.facebook.react.bridge.ReactApplicationContext

class IapkitModule(reactContext: ReactApplicationContext) :
  NativeIapkitSpec(reactContext) {

  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = NativeIapkitSpec.NAME
  }
}
