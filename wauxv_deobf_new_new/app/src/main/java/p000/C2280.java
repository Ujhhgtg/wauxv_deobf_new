package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2280 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7396;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f7397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f7398;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f7399;

    public /* synthetic */ C2280(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, Annotation annotation, BeanInfo beanInfo, int i) {
        this.f7396 = i;
        this.f7397 = readerAnnotationProcessor;
        this.f7398 = annotation;
        this.f7399 = beanInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7396) {
            case 0:
                this.f7397.lambda$processJacksonJsonDeserializer$5(this.f7398, this.f7399, (Method) obj);
                break;
            default:
                this.f7397.lambda$getBeanInfo1x$7(this.f7398, this.f7399, (Method) obj);
                break;
        }
    }
}
