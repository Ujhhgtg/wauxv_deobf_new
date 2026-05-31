package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2282 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7404 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderCreator f7405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f7406;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f7407;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Class f7408;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Type f7409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ String[] f7411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f7412;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderProvider f7413;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7414;

    public /* synthetic */ C2282(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f7405 = objectReaderCreator;
        this.f7406 = fieldInfo;
        this.f7407 = j;
        this.f7408 = cls;
        this.f7409 = type;
        this.f7410 = str;
        this.f7411 = strArr;
        this.f7414 = beanInfo;
        this.f7412 = linkedHashMap;
        this.f7413 = objectReaderProvider;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7404) {
            case 0:
                this.f7405.lambda$createFieldReaders$2(this.f7406, this.f7407, this.f7410, this.f7408, this.f7409, (String) this.f7414, this.f7411, this.f7412, this.f7413, (Field) obj);
                break;
            default:
                this.f7405.lambda$createFieldReaders$5(this.f7406, this.f7407, this.f7408, this.f7409, this.f7410, this.f7411, (BeanInfo) this.f7414, this.f7412, this.f7413, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2282(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f7405 = objectReaderCreator;
        this.f7406 = fieldInfo;
        this.f7407 = j;
        this.f7410 = str;
        this.f7408 = cls;
        this.f7409 = type;
        this.f7414 = str2;
        this.f7411 = strArr;
        this.f7412 = linkedHashMap;
        this.f7413 = objectReaderProvider;
    }
}
