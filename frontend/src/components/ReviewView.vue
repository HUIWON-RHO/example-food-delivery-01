<template>

    <v-data-table
        :headers="headers"
        :items="review"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ReviewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "reviewId", value: "reviewId" },
            ],
            review : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/reviews'))

            temp.data._embedded.reviews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.review = temp.data._embedded.reviews;
        },
        methods: {
        }
    }
</script>

