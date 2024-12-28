def frequencyGrouping(List<Integer> arr) {
    arr.countBy { it }
}

def arr = [1, 3, 4, 5, 1, 5, 4]
def res = frequencyGrouping(arr)
println res
