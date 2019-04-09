package com.tencent.shadow.core.transform.specific

import org.junit.Test

class ActivityTransformTest : SimpleRenameTransformTest(ActivityTransform(), arrayOf("test.TestActivity"),
        "foo", "com.tencent.shadow.runtime.ShadowActivity",
        mapOf("(Landroid/app/Activity;)Landroid/app/Activity;"
                to "(Lcom/tencent/shadow/runtime/ShadowActivity;)Lcom/tencent/shadow/runtime/ShadowActivity;")) {

    @Test
    fun testActivityTransform() {
        doTest()
    }
}