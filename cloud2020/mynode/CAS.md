```
    private AtomicInteger value = new AtomicInteger(0);
        atomicInteger.compareAndSet(oldValue,newValue);
        
        
      value 如果与旧值相同就将新值赋值给value 否则不改变value值
```