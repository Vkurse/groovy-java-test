
        def list = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(list)

        println(result)

        static def countElements(list) {
            def resultMap = [:]
            list.each { element ->
                resultMap[element] = resultMap.getOrDefault(element, 0) + 1
            }
            return resultMap
        }

