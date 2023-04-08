/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {
    var timeout = setTimeout(function() {
        fn.apply(null, args);
    }, t);

    var cancelFn = function() {
        clearTimeout(timeout);
    };

    return cancelFn;
}

/**
 * const result = []
 *
 * const fn = (x) => x * 5
 * const args = [2], t = 20, cancelT = 50
 *
 * const start = performance.now() // 코드가 실행되는 지금 시점 시간 (모니터링 하는데 많이 쓰인다고 함)
 *
 * const log = (...argsArr) => {
 *     const diff = Math.floor(performance.now() - start);
 *     result.push({"time": diff, "returned": fn(...argsArr)})
 *
 * const cancel = cancellable(log, args, t);
 *
 * const maxT = Math.max(t, cancelT)
 *
 * // 1. maxT가 t인경우 -> 함수가 실행되면 안됨 result가 그대로 [] 빈 배열이어야 함.
 * //    (cancel 함수의 fn.apply보다 clearTimeout이 먼저 실행)
 * // 2. maxT가 cancelT인 경우 -> 함수가 실행되어 result가 const log에서 실행된 push 값이어야 함.
 * //    (clearTimeout보다 cancel 함수의 fn.apply가 먼저 실행)
 * setTimeout(() => {
 *     cancel() // cancellable(log, args, t)
 * }, cancelT)
 *
 * setTimeout(() => {
 *     console.log(result)
 * }, maxT + 15)
 */