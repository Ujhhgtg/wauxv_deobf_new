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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1290feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4696Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderCreator f4697Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f4698Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ long f4699Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ String f4700Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Class f4701Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ Type f4702Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ String f4703Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ String[] f4704Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f4705Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f4706Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderProvider f4707Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1290feyxiexzfUjhhgtg(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, BeanInfo beanInfo, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f4697Ujhhgtgfeyxiexzf = objectReaderCreator;
        this.f4698Ujhhgtgfeyxiexzf = fieldInfo;
        this.f4699Ujhhgtgfeyxiexzf = j;
        this.f4700Ujhhgtgfeyxiexzf = str;
        this.f4701Ujhhgtgfeyxiexzf = cls;
        this.f4702Ujhhgtgfeyxiexzf = type;
        this.f4703Ujhhgtgfeyxiexzf = str2;
        this.f4704Ujhhgtgfeyxiexzf = strArr;
        this.f4705Ujhhgtgfeyxiexzf = beanInfo;
        this.f4706Ujhhgtgfeyxiexzf = linkedHashMap;
        this.f4707Ujhhgtgfeyxiexzf = objectReaderProvider;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4696Ujhhgtgfeyxiexzf) {
            case 0:
                this.f4697Ujhhgtgfeyxiexzf.lambda$createFieldReaders$3(this.f4698Ujhhgtgfeyxiexzf, this.f4699Ujhhgtgfeyxiexzf, this.f4700Ujhhgtgfeyxiexzf, this.f4701Ujhhgtgfeyxiexzf, this.f4702Ujhhgtgfeyxiexzf, this.f4703Ujhhgtgfeyxiexzf, this.f4704Ujhhgtgfeyxiexzf, this.f4706Ujhhgtgfeyxiexzf, this.f4707Ujhhgtgfeyxiexzf, this.f4705Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            default:
                this.f4697Ujhhgtgfeyxiexzf.lambda$createFieldReaders$4(this.f4698Ujhhgtgfeyxiexzf, this.f4699Ujhhgtgfeyxiexzf, this.f4700Ujhhgtgfeyxiexzf, this.f4701Ujhhgtgfeyxiexzf, this.f4702Ujhhgtgfeyxiexzf, this.f4703Ujhhgtgfeyxiexzf, this.f4704Ujhhgtgfeyxiexzf, this.f4705Ujhhgtgfeyxiexzf, this.f4706Ujhhgtgfeyxiexzf, this.f4707Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C1290feyxiexzfUjhhgtg(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider, BeanInfo beanInfo) {
        this.f4697Ujhhgtgfeyxiexzf = objectReaderCreator;
        this.f4698Ujhhgtgfeyxiexzf = fieldInfo;
        this.f4699Ujhhgtgfeyxiexzf = j;
        this.f4700Ujhhgtgfeyxiexzf = str;
        this.f4701Ujhhgtgfeyxiexzf = cls;
        this.f4702Ujhhgtgfeyxiexzf = type;
        this.f4703Ujhhgtgfeyxiexzf = str2;
        this.f4704Ujhhgtgfeyxiexzf = strArr;
        this.f4706Ujhhgtgfeyxiexzf = linkedHashMap;
        this.f4707Ujhhgtgfeyxiexzf = objectReaderProvider;
        this.f4705Ujhhgtgfeyxiexzf = beanInfo;
    }
}
