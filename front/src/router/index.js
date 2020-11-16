import { createWebHistory, createRouter } from "vue-router";
import Project from "@/views/Project.vue";

const routes = [
    {
        path: "/",
        name: "Project",
        component: Project,
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;