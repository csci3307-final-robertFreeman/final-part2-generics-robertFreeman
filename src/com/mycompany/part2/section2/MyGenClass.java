package com.mycompany.part2.section2;

public class MyGenClass<K, V> implements MyGenInterface<K, V>
{

	K key;
	V value;
	
	MyGenClass(K _key, V _value)
	{
		key = _key;
		value = _value;
	}
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
}
