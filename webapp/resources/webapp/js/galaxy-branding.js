jQuery(function() { // Wrap to run on init.
	intermine.options.GalaxyTool = 'mousemine';
	// if running on the same domain as your mine:
	intermine.options.brand[window.location.origin] = 'MouseMine';
	// otherwise you need to specify the domain specifically
	intermine.options.brand['http://mousemine1.jax.org:8080'] = 'MouseMine';
    });
