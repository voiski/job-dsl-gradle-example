def createListView(context, String name) {
    context.with {
        job(name) {}
    }
}

createListView this, 'yy'