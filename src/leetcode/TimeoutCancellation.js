var cancellable = function(fn, args, t) {
    var timeout = setTimeout(function() {
        fn.apply(null, args);
    }, t);

    var cancelFn = function() {
        clearTimeout(timeout);
    };

    return cancelFn;
};
