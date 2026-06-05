package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳ要点脸ᛲᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1311feyxiexzfUjhhgtg implements Function {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4784Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1311feyxiexzfUjhhgtg(int i) {
        this.f4784Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4784Ujhhgtgfeyxiexzf) {
            case 0:
                return ObjectReaderBaseModule.lambda$init$1(obj);
            case 1:
                return ObjectReaderBaseModule.lambda$init$2(obj);
            case 2:
                return ObjectReaderBaseModule.lambda$init$3(obj);
            case 3:
                return Duration.parse((String) obj);
            case 4:
                return ZoneOffset.of((String) obj);
            case 5:
                return ZoneId.of((String) obj);
            case 6:
                return TimeZone.getTimeZone((String) obj);
            case 7:
                return ((List) obj).stream();
            case 8:
                return ObjectReaderCreatorASM.lambda$buildHashCode32Map$0((Integer) obj);
            case 9:
                return ObjectReaderImplList.lambda$of$6(obj);
            case 10:
                return ObjectReaderImplList.lambda$of$7(obj);
            case 11:
                return ObjectReaderImplList.lambda$of$8(obj);
            case Opcodes.FCONST_1 /* 12 */:
                return Collections.synchronizedList((List) obj);
            case 13:
                return Collections.unmodifiableCollection((Collection) obj);
            case Opcodes.DCONST_0 /* 14 */:
                return Collections.unmodifiableList((List) obj);
            case 15:
                return Collections.unmodifiableSet((Set) obj);
            case 16:
                return Collections.unmodifiableSortedSet((SortedSet) obj);
            case Opcodes.SIPUSH /* 17 */:
                return Collections.unmodifiableNavigableSet((NavigableSet) obj);
            case Opcodes.LDC /* 18 */:
                return ObjectReaderImplList.lambda$readJSONBObject$9((Collection) obj);
            case 19:
                return Collections.synchronizedCollection((Collection) obj);
            case 20:
                return ObjectReaderImplList.lambda$readJSONBObject$10((List) obj);
            case Opcodes.ILOAD /* 21 */:
                return ObjectReaderImplList.lambda$readJSONBObject$11((Collection) obj);
            case Opcodes.LLOAD /* 22 */:
                return Collections.synchronizedSet((Set) obj);
            case Opcodes.FLOAD /* 23 */:
                return Collections.synchronizedSortedSet((SortedSet) obj);
            case Opcodes.DLOAD /* 24 */:
                return Collections.synchronizedNavigableSet((NavigableSet) obj);
            case Opcodes.ALOAD /* 25 */:
                return ObjectReaderImplList.lambda$of$1(obj);
            case 26:
                return ObjectReaderImplList.lambda$of$2(obj);
            case 27:
                return ObjectReaderImplList.lambda$of$3(obj);
            case 28:
                return ObjectReaderImplList.lambda$of$4(obj);
            default:
                return ObjectReaderImplList.lambda$of$5(obj);
        }
    }
}
