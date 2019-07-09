package com.you.test;

public class Test294 {
	public static int indexOf(char[] source, int sourceOffset, int sourceCount,
			char[] target, int targetOffset, int targetCount, int fromIndex) {
		if (fromIndex < 0) {
			fromIndex = 0;
		}
		if (sourceOffset >= source.length) {
			throw new ArrayIndexOutOfBoundsException("下标越界" + sourceOffset);
		} else if (targetOffset >= target.length) {
			throw new ArrayIndexOutOfBoundsException("下标越界" + targetOffset);
		} else if (sourceOffset + fromIndex >= source.length) {
			throw new ArrayIndexOutOfBoundsException("下标越界" + sourceOffset + fromIndex);
		} 
		if (targetCount == 0) {
			return sourceOffset;
		}
		if (sourceCount == 0) {
			return -1;
		}
		// 移动起始位置
		int i = sourceOffset + fromIndex;
		// 最大移动位置
		int max = sourceOffset + sourceCount -1 - targetCount + 1;
		// target首字符
		char first = target[targetOffset];
		while (i <= max) {
			if (source[i] == first) {
				int j = targetOffset + 1;
				int k = i + 1;
				// 此轮比较的最大下标
				int end = i + targetCount -1;
				while (source[k] == target[j] && k <= end) {
					k++;
					j++;
				}
				if (k > end) {
					// 匹配
					return i - sourceOffset;
				}
			}
			i++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		char[] cs = {'1', '1', '1','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};
		char[] cs2 = {'2', '2', '2', '2', '2', 'g', 'h', 'i', 'j','2', '2', '2'};
		int i = indexOf(cs, 3, 13, cs2, 5, 4, 2);
		System.err.println(i);
	}
}
