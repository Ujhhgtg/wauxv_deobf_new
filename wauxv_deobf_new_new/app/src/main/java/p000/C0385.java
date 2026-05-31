package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲈᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0385 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f1899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f1900;

    public /* synthetic */ C0385(Annotation annotation, FieldInfo fieldInfo, int i) {
        this.f1898 = i;
        this.f1899 = annotation;
        this.f1900 = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1898) {
            case 0:
                BeanUtils.lambda$processJacksonJsonIgnore$11(this.f1899, this.f1900, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$processGsonSerializedName$19(this.f1899, this.f1900, (Method) obj);
                break;
            case 2:
                BeanUtils.lambda$processJacksonJsonUnwrapped$16(this.f1899, this.f1900, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonInclude$15(this.f1899, this.f1900, (Method) obj);
                break;
            case 4:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonAlias$13(this.f1899, this.f1900, (Method) obj);
                break;
            case 5:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonSetter$12(this.f1899, this.f1900, (Method) obj);
                break;
            case 6:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJSONField1x$14(this.f1899, this.f1900, (Method) obj);
                break;
            case 7:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonProperty$11(this.f1899, this.f1900, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonProperty$6(this.f1899, this.f1900, (Method) obj);
                break;
        }
    }
}
