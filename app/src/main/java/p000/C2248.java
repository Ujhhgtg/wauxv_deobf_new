package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲇᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2248 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7269 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Class f7270;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7271;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f7272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f7274;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f7275;

    public /* synthetic */ C2248(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, String str, FieldInfo fieldInfo, Class cls, String str2, String str3) {
        this.f7273 = readerAnnotationProcessor;
        this.f7271 = str;
        this.f7272 = fieldInfo;
        this.f7270 = cls;
        this.f7274 = str2;
        this.f7275 = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (0) {
            case 0:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f7273).lambda$getFieldInfo$0(this.f7271, this.f7272, this.f7270, (String) this.f7274, (String) this.f7275, (Field) obj);
                break;
            default:
                ObjectReaderCreator.lambda$createObjectReaderWithCreator$0(this.f7270, (ObjectReaderProvider) this.f7273, (Class) this.f7274, (BeanInfo) this.f7275, this.f7271, this.f7272, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2248(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo) {
        this.f7270 = cls;
        this.f7273 = objectReaderProvider;
        this.f7274 = cls2;
        this.f7275 = beanInfo;
        this.f7271 = str;
        this.f7272 = fieldInfo;
    }
}
