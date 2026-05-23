package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2246 implements Consumer {

    public final /* synthetic */ int f7264;

    public final /* synthetic */ Annotation f7265;

    public final /* synthetic */ Object f7266;

    public final /* synthetic */ Object f7267;

    public /* synthetic */ C2246(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, Annotation annotation, FieldInfo fieldInfo) {
        this.f7264 = 1;
        this.f7266 = readerAnnotationProcessor;
        this.f7265 = annotation;
        this.f7267 = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7264) {
            case 0:
                ObjectReaderBaseModule.lambda$getBeanInfo1xJSONPOJOBuilder$0(this.f7265, (BeanInfo) this.f7266, (Class) this.f7267, (Method) obj);
                break;
            case 1:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f7266).lambda$processJacksonJsonDeserialize$0(this.f7265, (FieldInfo) this.f7267, (Method) obj);
                break;
            case 2:
                ((ObjectWriterBaseModule.WriterAnnotationProcessor) this.f7267).lambda$processJacksonJsonSerialize$0(this.f7265, (BeanInfo) this.f7266, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonPropertyOrder$0(this.f7265, (BeanInfo) this.f7266, (AtomicBoolean) this.f7267, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2246(ObjectWriterBaseModule.WriterAnnotationProcessor writerAnnotationProcessor, Annotation annotation, BeanInfo beanInfo) {
        this.f7264 = 2;
        this.f7267 = writerAnnotationProcessor;
        this.f7265 = annotation;
        this.f7266 = beanInfo;
    }

    public /* synthetic */ C2246(Annotation annotation, BeanInfo beanInfo, Serializable serializable, int i) {
        this.f7264 = i;
        this.f7265 = annotation;
        this.f7266 = beanInfo;
        this.f7267 = serializable;
    }
}
