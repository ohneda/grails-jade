grails {
	plugin {
		jade {
			/* Format the HTML or compress the output by removing unecessary whitespace. */
			prettyPrint = true

			/* Store the parsed template or reparse for every request. */
			caching = true

			/* Render exceptions in view or fail silently. */
			renderExceptions = true

			/* Additional filter for embedding different content types in a template, such as markdown, coffeescript */
			filter = null

			/* Default objects available to all templates. */
			sharedVariables = [:]
		}
	}
}