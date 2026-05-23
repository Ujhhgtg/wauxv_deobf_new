package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2249 implements Consumer {

    public final /* synthetic */ int f7276;

    public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f7277;

    public final /* synthetic */ Annotation f7278;

    public final /* synthetic */ BeanInfo f7279;

    public /* synthetic */ C2249(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, Annotation annotation, BeanInfo beanInfo, int i) {
        this.f7276 = i;
        this.f7277 = readerAnnotationProcessor;
        this.f7278 = annotation;
        this.f7279 = beanInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7276) {
            case 0:
                this.f7277.lambda$processJacksonJsonDeserializer$0(this.f7278, this.f7279, (Method) obj);
                break;
            default:
                this.f7277.lambda$getBeanInfo1x$0(this.f7278, this.f7279, (Method) obj);
                break;
        }
    }
}
