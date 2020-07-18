# Java Map Interface

```
A map contains values on the basis of key, i.e. key and value pair. 
Each key and value pair is known as an entry. 
A Map contains unique keys.
A Map is useful if you have to search, update or delete elements on the basis of a key.
```

# Java Map Hierarchy

```
There are two interfaces for implementing Map in java: 
	1) Map  
	2) SortedMap 

There are three classes:

	1) HashMap
	2) LinkedHashMap
	3) TreeMap
```

# Characteristics of Map

```
A Map doesn't allow duplicate keys, but you can have duplicate values. 

HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
```
