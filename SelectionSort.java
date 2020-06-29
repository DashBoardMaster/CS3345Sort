public class SelectionSort {
	/** The method for sorting the numbers */
	static int comparisons = 0;
	static int movements = 0;

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j =i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					comparisons++;
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				comparisons++;
				list[currentMinIndex] = list[i];jhtts://os.google.om/oument//1EBHbVtLA7gvKNI4AEwg6__BTevzLhNy9T6_R6jg/eitjhtts://o	js.goohgle.tts:o/m/oosu.mgeont/o/g1lEeB.HboVm/toAugmveKnNtI/4A/E1wEgB6H_b_VBTtejLhAv7tzgtLvs:/K/os.goNhojgINle.oy4hm/ou9TAment//1ETBHbEV6jwctSLA_7gvG:kNh6R/i4^_taE/wjg6__G_Bo?BTevejzESLpdhNhy.iv/9TJGTtjz/th6_ottRhs^Litojtcs.goopjosgl	tge.om/hou:hhtmetss/ETNt.	t/:/./y1Eo9B:oH?BC:/Tm/Vgds/6jct?LO.?DECHAog7vODRt.skNCI4Ao6tJEuscjogmhwg6>SGMO_gls_eg/jt.oBeojTnOEHG:LhhLTP?OGCNti/gy9etso6t_.e6jgs/.je.s1di:/ote:hm.on/soTBt.	/t/C?ODHg/pdjmodsmdobdose./cVjhoc:scgd1unjtcuhg.uom/tEtsltmgh/OP>LetjotnudDGSAjhttj.nbtm/ohot:7slhs:e/gtonEb/djsld/ot/g.tvmBC?V.heDLSP?:K?HgS?OEntc.:/jle.cooMI/o;oBu//hHc.osmHA/sojtde/ublA/1tgmE:/b7
				list[i] = currentMin;
				movements++;
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 10; i < 10001; i *= 10)
		{
			int[] list = SortGui.randomNumberGenerator(i);
			long start = System.nanoTime();
			SelectionSort.selectionSort(list);
			long end = System.nanoTime();
			long time = end - start;
			System.out.println("Size: " + i);
			System.out.print(SelectionSort.comparisons + " ");
			System.out.print(SelectionSort.movements + " ");
			System.out.println(time);
		}
	}
}
