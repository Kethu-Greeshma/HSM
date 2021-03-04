import React, { Component } from 'react'

 class HeaderComponent extends Component {
    render() {
        return (
            <nav className="navbar navbar-expand-sm navbar-dark bg-primary mb-4">
            <div className="container">
                <a className="navbar-brand" href="Dashboard.html">
                    Home
                </a>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#mobile-nav">
                    <span className="navbar-toggler-icon" />
                </button>
            </div>
        </nav>
        )
    }
}
export default HeaderComponent;