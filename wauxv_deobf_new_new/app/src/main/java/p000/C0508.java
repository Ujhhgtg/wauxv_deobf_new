package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0027;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0508 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0348 f2180 = new C0348(12);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0507 f2181 = new C0507(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f2182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f2183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0519 f2186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0348 f2185 = f2180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0507 f2184 = f2181;

    public C0508(Context context, ArrayList arrayList, InterfaceC0399 interfaceC0399, C1893 c1893) {
        this.f2182 = context.getApplicationContext();
        this.f2183 = arrayList;
        this.f2186 = new C0519(interfaceC0399, 13, c1893);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m1953(C1462 c1462, int i, int i2) {
        int iMin = Math.min(c1462.f5198 / i2, c1462.f5197 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c1462.f5197 + "x" + c1462.f5198 + "]");
        }
        return iMax;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1355(Object obj, C2336 c2336) {
        return !((Boolean) c2336.m4294(AbstractC1464.f5208)).booleanValue() && AbstractC0738.m2274(this.f2183, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final p000.InterfaceC2624 mo1356(java.lang.Object r8, int r9, int r10, p000.C2336 r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤞᲀᤝ r8 = r7.f2184
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f2179     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᤞᛸ r0 = (p000.C1463) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᤞᛸ r0 = new ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᤞᛸ     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f5204 = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f5203     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᛸᤞ r0 = new ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᛸᤞ     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f5205 = r0     // Catch: java.lang.Throwable -> L54
            r5.f5206 = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f5204 = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f5204     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᲀᲇᛸ r8 = r1.m1954(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤞᲀᤝ r9 = r1.f2184
            r9.m1952(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤞᲀᤝ r9 = r1.f2184
            r9.m1952(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0508.mo1356(java.lang.Object, int, int, ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲇᲁᲈ):ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᛸᤝᲇᲈ");
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:407)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:287)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:205)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:138)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C1455 m1954(ByteBuffer byteBuffer, int i, int i2, C1463 c1463, C2336 c2336) {
        StringBuilder sb;
        int i3 = AbstractC1879.f6242;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C1462 c1462M3256 = c1463.m3256();
            if (c1462M3256.f5194 > 0 && c1462M3256.f5193 == 0) {
                Bitmap.Config config = c2336.m4294(AbstractC1464.f5207) == EnumC0973.f3534 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM1953 = m1953(c1462M3256, i, i2);
                C0348 c0348 = this.f2185;
                C0519 c0519 = this.f2186;
                c0348.getClass();
                C2866 c2866 = new C2866(c0519, c1462M3256, byteBuffer, iM1953);
                c2866.m4817(config);
                c2866.f9130 = (c2866.f9130 + 1) % c2866.f9131.f5194;
                Bitmap bitmapM4816 = c2866.m4816();
                if (bitmapM4816 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC1879.m3798(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C1455 c1455 = new C1455(new C1454(new C0170(new C1461(ComponentCallbacks2C0027.m757(this.f2182), c2866, i, i2, bitmapM4816), 1)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC1879.m3798(jElapsedRealtimeNanos));
                }
                return c1455;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC1879.m3798(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC1879.m3798(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
