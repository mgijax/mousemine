jQuery(function() { // Wrap to run on init.
	intermine.options.GalaxyTool = 'mousemine';
	// if running on the same domain as your mine:
	intermine.options.brand[window.location.origin] = 'MouseMine';
	// otherwise you need to specify the domain specifically
	intermine.options.brand['http://mousemine1.jax.org:8080'] = 'TestMouseMine';
	intermine.options.brand['http://bh-mmdev.jax.org:8080'] = 'DevMouseMine';
	intermine.options.brand['http://beta.mousemine.org:8080'] = 'BetaMouseMine';
	intermine.options.brand['http://bhmmprod1.jax.org:8080'] = 'ProdMouseMine';
    });
