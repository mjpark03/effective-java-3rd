
/* common names for staic factory methods */

// 1. from: type-conversion method
Date d = Date.from(instant);

// 2. of: aggregation method
Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

// 3. valueOf
BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

// 4. instance or getInstance
StackWalker luke = StackWalker.getInstance(options);

// 5. create or newInstance
Object newArray = Array.newInstance(classObject, arrayLen);

// 6. getType
FileStore fs = Files.getFileStore(path);

// 7. newtype
BufferedReader br = Files.newBufferedReader(path);

// 8. type 
List<Complaint> litany = Collections.list(legacyLitany);