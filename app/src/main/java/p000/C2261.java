package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2261 implements Consumer {

    public final /* synthetic */ int f7329;

    public final /* synthetic */ ObjectWriterBaseModule.WriterAnnotationProcessor f7330;

    public final /* synthetic */ Annotation f7331;

    public final /* synthetic */ FieldInfo f7332;

    public /* synthetic */ C2261(ObjectWriterBaseModule.WriterAnnotationProcessor writerAnnotationProcessor, Annotation annotation, FieldInfo fieldInfo, int i) {
        this.f7329 = i;
        this.f7330 = writerAnnotationProcessor;
        this.f7331 = annotation;
        this.f7332 = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7329) {
            case 0:
                this.f7330.lambda$processJacksonJsonSerialize$1(this.f7331, this.f7332, (Method) obj);
                break;
            default:
                this.f7330.lambda$processJSONField1x$0(this.f7331, this.f7332, (Method) obj);
                break;
        }
    }
}
