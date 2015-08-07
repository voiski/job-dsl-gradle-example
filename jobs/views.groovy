def createListView(context, name) {
    context.with {
        listView(name) {
            jobs {
                regex 'xxx'
            }
            columns {
                status()
                weather()
                delegate.name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
            }
        }
    }
}

nestedView('Overview') {
    views {
        createListView delegate, 'xx', 'xx'
    }
}

createListView this, 'yy', 'yy'